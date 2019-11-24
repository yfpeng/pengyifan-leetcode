"""
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid
cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is
exactly one island (i.e., one or more connected land cells). The island doesn't have"lakes"(water inside that isn't
connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and
height don't exceed 100. Determine the perimeter of the island.

Example:

    [[0,1,0,0],
     [1,1,1,0],
     [0,1,0,0],
     [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:
"""


def island_perimeter(grid):
    """
    :type grid: List[List[int]]
    :rtype: int
    """
    row = len(grid)
    col = len(grid[0])

    total = 0
    inside = 0
    for i in range(0, row):
        for j in range(0, col):
            if grid[i][j] == 1:
                total += 1
                if j+1 < col and grid[i][j+1] == 1:
                    inside += 1
                if i+1 < row and grid[i+1][j] == 1:
                    inside += 1
    return 4 * total - 2 * inside


def test_island_perimeter():
    grid = [[0,1,0,0],
            [1,1,1,0],
            [0,1,0,0],
            [1,1,0,0]]
    assert island_perimeter(grid) == 16

if __name__ == '__main__':
    test_island_perimeter()