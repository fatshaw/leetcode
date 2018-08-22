@Test
public void testnumFriendRequests() {
    assert numFriendRequests(new int[]{16, 17, 18}) == 2;
    assert numFriendRequests(new int[]{16, 16, 16}) == 6;
    assert numFriendRequests(new int[]{12, 16, 16}) == 2;
    assert numFriendRequests(new int[]{20, 30, 100, 110, 120}) == 3;
    assert numFriendRequests(new int[]{8, 24, 69, 85, 85}) == 4;
    assert numFriendRequests(new int[]{6, 6, 15, 26, 30, 35, 39, 46, 60, 71, 73, 100, 106, 110, 112}) == 29;
    assert numFriendRequests(new int[]{13, 27, 42, 42, 55, 56, 56, 57, 67, 97, 100, 113, 117, 117, 119}) == 48;
}