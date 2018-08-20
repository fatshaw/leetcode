@Test
public void testnumJewelsInStones() {
    assert numJewelsInStones("A", "B") == 0;
    assert numJewelsInStones("A", "A") == 1;
    assert numJewelsInStones("aj", "bbbaJ") == 1;
}