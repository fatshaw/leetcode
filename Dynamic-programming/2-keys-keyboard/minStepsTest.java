@Test
public void testminSteps() {
    assert minSteps(1) == 0;
    assert minSteps(2) == 2;

    assert minSteps(3) == 3;
    assert minSteps(4) == 4;
    assert minSteps(5) == 5;
    assert minSteps(6) == 5;
    assert minSteps(7) == 7;
    assert minSteps(9) == 6;
    assert minSteps(10) == 7;
    assert minSteps(15) == 8;
}