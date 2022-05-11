class Solution:
    def climbStairs(self, n: int) -> int:
        x = 1
        y = 1
        for i in range(n - 1):
            temp = x
            x = x + y
            y = temp
        return x


a = int(input("Enter int"))
print(Solution.climbStairs(a))
