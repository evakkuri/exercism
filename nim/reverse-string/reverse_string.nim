func reverse*(s: string): string =
  var tmp = ""

  for i in countdown((s.len - 1), 0):
    tmp.add(s[i])

  tmp


