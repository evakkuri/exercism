#include "reverse_string.h"

namespace reverse_string
{
  std::string reverse_string(std::string orig_string)
  {
    std::string reversed = std::string(orig_string.rbegin(), orig_string.rend());

    return reversed;
  }
} // namespace reverse_string
