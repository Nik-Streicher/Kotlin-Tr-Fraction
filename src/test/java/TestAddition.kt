import org.junit.Assert
import java.lang.ArithmeticException
import org.junit.BeforeClass
import org.junit.Test

class TestAddition {
    @Test(expected = ArithmeticException::class)
    fun zeroDenominatorShouldThrowException() {
        fraction!!.dividedBy(Fraction(5, 0))
    }

    @Test
    fun testSimple() {
        val result = fraction!!.plus(Fraction(3, 5))
        Assert.assertEquals(18, result.numerator)
        Assert.assertEquals(5, result.denominator)
    }

    @Test
    fun testNormalisation() {
        val nFraction = Fraction(1, 2)
        val result = nFraction.plus(Fraction(1, 2))
        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }

    @Test
    fun divideTest() {
        val result = fraction!!.dividedBy(Fraction(3, 5))
        Assert.assertEquals(5, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }

    @Test
    fun timesTest() {
        val result = fraction!!.times(Fraction(3, 5))
        Assert.assertEquals(9, result.numerator)
        Assert.assertEquals(5, result.denominator)
    }

    @Test
    fun minusTest() {
        val result = fraction!!.minus(Fraction(3, 5))
        Assert.assertEquals(12, result.numerator)
        Assert.assertEquals(5, result.denominator)
    }

    companion object {
        private var fraction: Fraction? = null
        var numerator = 15
        var denominator = 5
        @BeforeClass
        fun createNewFraction() {
            fraction = Fraction(numerator, denominator)
        }
    }
}