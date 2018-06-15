@Test
public void testmerge() {
    int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
    merge(num1, 3, new int[]{4, 5, 6}, 3);
    for (int i : num1) {
        System.out.println(i);
    }

    num1 = new int[]{4, 5, 6, 0, 0, 0};
    merge(num1, 3, new int[]{1, 2, 3}, 3);
    for (int i : num1) {
        System.out.println(i);
    }

    num1 = new int[]{1, 3, 5, 0, 0, 0};
    merge(num1, 3, new int[]{2, 4, 6}, 3);
    for (int i : num1) {
        System.out.println(i);
    }
}