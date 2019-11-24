class Solution(object):
    d = {
        k: bin(k).count('1') for k in range(60)
    }

    def readBinaryWatch(self, num):
        """
        :type num: int
        :rtype: List[str]
        """
        return ['%d:%02d' % (h, m) for h in range(12) for m in range(60) if Solution.d[h] + Solution.d[m] == num]