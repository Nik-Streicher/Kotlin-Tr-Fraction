import java.lang.UnsupportedOperationException

class NotImplementedFraction(override val numerator: Int, override val denominator: Int) : IFraction {
    override fun plus(other: IFraction?): IFraction? {
        throw UnsupportedOperationException()
    }

    override fun minus(other: IFraction?): IFraction? {
        throw UnsupportedOperationException()
    }

    override fun times(other: IFraction?): IFraction? {
        throw UnsupportedOperationException()
    }

    override fun dividedBy(other: IFraction?): IFraction? {
        throw UnsupportedOperationException()
    }
}