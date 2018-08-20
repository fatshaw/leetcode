@Test
public void testproductExceptSelf() {
    int[] ret = productExceptSelf(new int[]{1, 2, 3, 4});
    for (int r : ret) {
        System.out.println(r);
    }
}