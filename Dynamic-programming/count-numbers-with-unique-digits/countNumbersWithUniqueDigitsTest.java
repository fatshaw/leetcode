@Test
public void testcountNumbersWithUniqueDigits() {
    assert countNumbersWithUniqueDigits(0) == 1;
    assert countNumbersWithUniqueDigits(1) == 10;
    assert countNumbersWithUniqueDigits(2) == 91;
    assert countNumbersWithUniqueDigits(3) == 739;
    assert countNumbersWithUniqueDigits(4) == 5275;
    assert countNumbersWithUniqueDigits(5) == 32491;
}