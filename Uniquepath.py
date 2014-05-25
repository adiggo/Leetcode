class Uniquepath:
    def uniquePaths(self, m, n):
        mp = [[0 for i in xrange(n)] for i in xrange(m)]
        for i in xrange(m):
            mp[i][0] = 1
        for j in xrange(n):
            mp[0][j]=1

        for i in xrange(1,m):
            for j in xrange(1,n):
                mp[i][j] = mp[i-1][j] + mp[i][j-1]

        return mp[m-1][n-1]
