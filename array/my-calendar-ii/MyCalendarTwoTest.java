@Test
public void testMyCalendarTwo() {
    MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
    assert myCalendarTwo.book(10, 20);
    assert myCalendarTwo.book(50, 60);
    assert myCalendarTwo.book(10, 40);
    assert !myCalendarTwo.book(5, 15);
    assert myCalendarTwo.book(5, 10);
    assert myCalendarTwo.book(25, 55);

    myCalendarTwo = new MyCalendarTwo();
    assert myCalendarTwo.book(24, 40);
    assert myCalendarTwo.book(43, 50);
    assert myCalendarTwo.book(27, 43);
    assert myCalendarTwo.book(5, 21);
    assert !myCalendarTwo.book(30, 40);
    assert !myCalendarTwo.book(14, 29);
    assert myCalendarTwo.book(3, 19);
    assert !myCalendarTwo.book(3, 14);
    assert !myCalendarTwo.book(25, 39);
    assert !myCalendarTwo.book(6, 19);

}