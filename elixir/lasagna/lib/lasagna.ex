defmodule Lasagna do
  def expected_minutes_in_oven() do
    40
  end

  def remaining_minutes_in_oven(spent_minutes) do
    expected_minutes_in_oven() - spent_minutes
  end

  def preparation_time_in_minutes(layers) do
    2 * layers
  end

  def total_time_in_minutes(layers, spent_minutes) do
    preparation_time_in_minutes(layers) + spent_minutes
  end

  def alarm() do
    "Ding!"
  end
end
