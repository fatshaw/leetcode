@Test
public void testcanJump() {
    assert canJump(new int[]{2, 3, 1, 1, 4});
    assert !canJump(new int[]{3, 2, 1, 0, 4});
}