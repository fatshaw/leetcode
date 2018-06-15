@Test
public void testcanPlaceFlowers() {
    assert canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);
    assert canPlaceFlowers(new int[]{1, 0, 0}, 1);
    assert !canPlaceFlowers(new int[]{0, 1, 0}, 1);
    assert !canPlaceFlowers(new int[]{0, 1, 0, 0, 1}, 1);
    assert canPlaceFlowers(new int[]{0, 0, 0, 0, 1}, 2);
    assert canPlaceFlowers(new int[]{0}, 1);
}