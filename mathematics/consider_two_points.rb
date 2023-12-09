def find_point(px, py, qx, qy)
  rx = 2 * qx - px
  ry = 2 * qy - py

  [rx, ry]
end

n = gets.to_i

n.times do
  px, py, qx, qy = gets.split.map(&:to_i)

  result = find_point(px, py, qx, qy)
  puts result.join(' ')
end