#include <iostream>

int* findPoint(int px, int py, int qx, int qy) {
    static int result[2];
    result[0] = 2 * qx - px;
    result[1] = 2 * qy - py;
    return result;
}

int main() {
    int n;
    std::cin >> n;

    for (int i = 0; i < n; i++) {
        int px, py, qx, qy;
        std::cin >> px >> py >> qx >> qy;

        int* result = findPoint(px, py, qx, qy);
        std::cout << result[0] << " " << result[1] << std::endl;
    }

    return 0;
}
