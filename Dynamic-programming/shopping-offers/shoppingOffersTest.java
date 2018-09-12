@Test
public void testshoppingOffers() {
    assert 14 == shoppingOffers(Arrays.asList(2, 5), Arrays.asList(Arrays.asList(3, 0, 5), Arrays.asList(1, 2, 10)),
        Arrays.asList(3, 2));

    assert 11 == shoppingOffers(Arrays.asList(2, 3, 4),
        Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)),
        Arrays.asList(1, 2, 1));

    assert 0 == shoppingOffers(Arrays.asList(2, 3, 4),
        Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)),
        Arrays.asList(0, 0, 0));

    assert 0 == shoppingOffers(Arrays.asList(0, 0, 0),
        Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)),
        Arrays.asList(1, 1, 1));

    assert 2 == shoppingOffers(Arrays.asList(9, 9),
        Arrays.asList(Arrays.asList(1, 1, 1)),
        Arrays.asList(2, 2));

    assert 10 == shoppingOffers(Arrays.asList(9, 9),
        Arrays.asList(Arrays.asList(1, 2, 1)),
        Arrays.asList(2, 2));

    assert 36 == shoppingOffers(Arrays.asList(9, 9),
        Arrays.asList(Arrays.asList(3, 2, 1)),
        Arrays.asList(2, 2));

    assert 3 == shoppingOffers(Arrays.asList(2, 3),
        Arrays.asList(Arrays.asList(1, 0, 1), Arrays.asList(0, 1, 2)),
        Arrays.asList(1, 1));
}