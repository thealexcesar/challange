function findPoint(px, py, qx, qy) {
    const rx = 2 * qx - px;
    const ry = 2 * qy - py;
    return [rx, ry];
}

const n = parseInt(prompt("Enter the number of sets of points:"));

for (let i = 0; i < n; i++) {
    const input = prompt("Enter four space-separated integers:").split(" ");
    const px = parseInt(input[0]);
    const py = parseInt(input[1]);
    const qx = parseInt(input[2]);
    const qy = parseInt(input[3]);

    const result = findPoint(px, py, qx, qy);
    console.log(result[0] + " " + result[1]);
}
