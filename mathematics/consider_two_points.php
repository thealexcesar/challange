<?php
function findPoint($px, $py, $qx, $qy) {
    $rx = 2 * $qx - $px;
    $ry = 2 * $qy - $py;
    return [$rx, $ry];
}

$n = intval(fgets(STDIN));

for ($i = 0; $i < $n; $i++) {
    $input = explode(" ", fgets(STDIN));
    $px = intval($input[0]);
    $py = intval($input[1]);
    $qx = intval($input[2]);
    $qy = intval($input[3]);

    $result = findPoint($px, $py, $qx, $qy);
    echo $result[0] . " " . $result[1] . "\n";
}
?>
