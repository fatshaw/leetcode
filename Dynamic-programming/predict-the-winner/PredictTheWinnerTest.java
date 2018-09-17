@Test
public void testPredictTheWinner() {
    assert true == PredictTheWinner(new int[]{1});
    assert true == PredictTheWinner(new int[]{0});

    assert true == PredictTheWinner(new int[]{1, 2, 4, 5});
    assert false == PredictTheWinner(new int[]{1, 3, 2});
    assert true == PredictTheWinner(new int[]{1, 5, 233,7});
}