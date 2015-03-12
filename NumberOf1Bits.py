class Solution:
    # @param n, an integer
    # @return an integer
    def hammingWeight(self, n):
        s = (bin(n)[2:])
        count = 0
        for number in s:
            if number == '1':
                count += 1
        return count