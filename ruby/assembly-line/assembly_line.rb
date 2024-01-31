class AssemblyLine
  BASE_RATE = 221

  def initialize(speed)
    @speed = speed
    @success_rate =
      if (@speed <= 4)
          1
      elsif (@speed <= 8)
        0.9
      elsif (@speed == 9)
        0.8
      else
        0.77
      end
  end

  def production_rate_per_hour
    BASE_RATE * @speed * @success_rate
  end

  def working_items_per_minute
    (production_rate_per_hour() / 60).floor()
  end
end
