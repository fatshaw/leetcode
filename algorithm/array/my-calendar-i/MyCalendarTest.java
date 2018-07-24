@Test
public void testMyCalendar() {
    MyCalendar myCalendar = new MyCalendar();
    assert myCalendar.book(1, 2);
    assert myCalendar.book(10, 20);
    assert !myCalendar.book(15, 35);
    assert myCalendar.book(20, 30);
}