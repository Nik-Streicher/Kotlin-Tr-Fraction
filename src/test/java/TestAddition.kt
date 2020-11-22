import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAddition {

    private static Fraction fraction;
    public static int numerator = 15;
    public static int denominator = 5;

    @BeforeClass
    public static void createNewFraction() {
        fraction = new Fraction(numerator, denominator);
    }


    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        fraction.dividedBy(new Fraction(5, 0));
    }

    @Test
    public void testSimple() {

        var result = fraction.plus(new Fraction(3, 5));

        Assert.assertEquals((Integer) 18, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }


    @Test
    public void testNormalisation() {
        var nFraction = new Fraction(1,2);
        var result = nFraction.plus(new Fraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }

    @Test
    public void divideTest() {
        var result = fraction.dividedBy(new Fraction(3, 5));

        Assert.assertEquals((Integer) 5, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }

    @Test
    public void timesTest() {
        var result = fraction.times(new Fraction(3, 5));

        Assert.assertEquals((Integer) 9, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void minusTest() {
        var result = fraction.minus(new Fraction(3, 5));

        Assert.assertEquals((Integer) 12, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }
}
