data class Point(val x: Int, val y: Int) {
    fun up() = Point(x - 1, y)
    fun down() = Point(x + 1, y)
    fun left() = Point(x, y - 1)
    fun right() = Point(x, y + 1)
}

class RainIsland(private val grids: Array<Array<Int>>) {

    private val cache: MutableMap<Point, IntArray> = mutableMapOf()

    fun findAllGridsReachSea(): List<Point> {
        if (grids.isEmpty()) return listOf()

        val result = mutableListOf<Point>()
        for (x in grids.indices) {
            for (y in grids[x].indices) {
                val p = Point(x, y)
                if (check(p, DIRECTION_UP, mutableSetOf()) == YES &&
                    check(p, DIRECTION_DOWN, mutableSetOf()) == YES &&
                    check(p, DIRECTION_LEFT, mutableSetOf()) == YES &&
                    check(p, DIRECTION_RIGHT, mutableSetOf()) == YES) {
                    result.add(Point(x, y))
                }
            }
        }

        return result

    }

    private fun check(point: Point, direction: Int, visited: MutableSet<Point>): Int {
        if (direction == DIRECTION_UP && point.x == 0) return YES
        if (direction == DIRECTION_DOWN && point.x == grids.size - 1) return YES
        if (direction == DIRECTION_LEFT && point.y == 0) return YES
        if (direction == DIRECTION_RIGHT && point.y == grids[point.x].size - 1) return YES

        var array = cache.getOrDefault(point, intArrayOf(UNKNOWN, UNKNOWN, UNKNOWN, UNKNOWN))
        if (array[direction] > UNKNOWN) return array[direction]

        cache[point] = array
        visited.add(point)

        // up
        var to = point.up()
        if (to.x >= 0 && canFlow(point, to, visited, direction)) {
            array[direction] = YES
            return array[direction]
        }

        // left
        to = point.left()
        if (to.y >= 0 && canFlow(point, to, visited, direction)) {
            array[direction] = YES
            return array[direction]
        }

        // right
        to = point.right()
        if (to.y <= grids[to.x].size - 1 && canFlow(point, to, visited, direction)) {
            array[direction] = YES
            return array[direction]
        }

        // down
        to = point.down()
        if (to.x <= grids.size - 1 && canFlow(point, to, visited, direction)) {
            array[direction] = YES
            return array[direction]
        }

        array[direction] = NO
        return array[direction]

    }

    private fun canFlow(
        point: Point,
        to: Point,
        visited: MutableSet<Point>,
        direction: Int
    ) = (grids[point.x][point.y] >= grids[to.x][to.y]
            && visited.contains(to).not()
            && check(to, direction, visited) == YES)

    companion object {
        private const val YES: Int = 1
        private const val NO: Int = 0
        private const val UNKNOWN: Int = -1

        private const val DIRECTION_UP = 0
        private const val DIRECTION_DOWN = 1
        private const val DIRECTION_LEFT = 2
        private const val DIRECTION_RIGHT = 3
    }

}
