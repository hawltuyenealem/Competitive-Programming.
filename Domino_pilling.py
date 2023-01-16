def domino_pilling(){
  m, n = map(int, input().split())
  
  if m == 1 and n == 1:
    return 0
else:
   return int(m * n) // 2
}

