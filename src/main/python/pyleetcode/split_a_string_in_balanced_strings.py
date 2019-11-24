class Solution:
    def balancedStringSplit(self, s: str) -> int:
        n = 0
        r = 0
        for c in s:
            if c == 'R':
                r += 1
            else:
                r -= 1
            if r == 0:
                n += 1
        return n

    def test_balancedStringSplit(self):
        assert self.balancedStringSplit('RLRRLLRLRL') == 4


if __name__ == "__main__":
    s = Solution()
    s.test_balancedStringSplit()