class LogLineParser
  def initialize(line)
    @line = line
  end

  def message
    @line.split(':')[1].strip()
  end

  def log_level
    msg = @line.split(':')[0]
    res = msg.match(/\[([A-Za-z]+)\]/)[1].downcase()
    res
  end

  def reformat
    "#{message()} (#{log_level()})"
  end
end
