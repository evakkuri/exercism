import std/strformat

func reverse*(s: string): string =
  if s.len <= 1:
    result = s 
  else:
    result = fmt"{s[s.len - 1]}{s[0..s.len - 2].reverse()}"
