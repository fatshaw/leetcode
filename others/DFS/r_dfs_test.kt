
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import tdd.Point
import tdd.RainIsland

class RainIslandTest {
    @Test
    fun ppyTest() {
        val input = arrayOf(arrayOf(1, 1, 1, 1), arrayOf(2, 4, 5, 3), arrayOf(1, 6, 1, 4), arrayOf(2, 1, 2, 3))
        val grids = RainIsland(input).findAllGridsReachSea()
        assertThat(grids).isEqualTo(listOf(Point(2, 1), Point(2, 3)))
    }
}