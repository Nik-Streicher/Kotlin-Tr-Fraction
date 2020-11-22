import java.lang.ArithmeticException

class Fraction(private val numerator: Int, denominator: Int) : IFraction {
    private val denominator: Int? = null
    private fun reduceFraction(numerator: Int, denominator: Int): Fraction {
        var numerator = numerator
        var denominator = denominator
        val d: Int
        d = greatestCommonDivisor(numerator, denominator)
        numerator = numerator / d
        denominator = denominator / d
        return Fraction(numerator, denominator)
    }

    private fun greatestCommonDivisor(a: Int, b: Int): Int {
        return if (b == 0) a else greatestCommonDivisor(b, a % b)
    }

    override fun getNumerator(): Int {
        return numerator
    }

    override fun getDenominator(): Int {
        return denominator!!
    }

    override fun plus(other: IFraction): IFraction {
        return reduceFraction(numerator * other.denominator + denominator!! * other.numerator, denominator * other.denominator)
    }

    override fun minus(other: IFraction): IFraction {
        return reduceFraction(numerator * other.denominator - denominator!! * other.numerator, denominator * other.denominator)
    }

    override fun times(other: IFraction): IFraction {
        return reduceFraction(numerator * other.numerator, denominator!! * other.denominator)
    }

    override fun dividedBy(other: IFraction): IFraction {
        return reduceFraction(numerator * other.denominator, denominator!! * other.numerator)
    }

    init {
        if (denominator == 0) {
            throw ArithmeticException("Divide by zero is not allowed")
        } else this.denominator = denominator
    }
}