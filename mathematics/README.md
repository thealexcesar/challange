# Mathematics Fundamentals
> [Visit HackerHank](https://www.hackerrank.com/challenges/find-point/problem?isFullScreen=true)

Consider two points, **p = (p<sub>x</sub>p<sub>y</sub>) and q = (q<sub>x</sub>q<sub>y</sub>)**.
We consider the inversion or [point reflection](https://en.wikipedia.org/wiki/Point_reflection),
**r = (r<sub>x</sub>r<sub>y</sub>)**, of point **p** across point **q** to be a 180&#176; rotation of point around.

Given **n** sets of points  and , find  for each pair of points and print two space-separated integers denoting the respective values of  and  on a new line.

## Function Description

Complete the findPoint function in the editor below.

findPoint has the following parameters:

- int px, py, qx, qy: x and y coordinates for points **p** and **q**

## Returns

- int[2]: x and y coordinates of the reflected point **r**

## Input Format

The first line contains an integer, **n**, denoting the number of sets of points.
Each of the **n** subsequent lines contains four space-separated integers that describe the respective values of
**p<sub>x</sub>**, **p<sub>y</sub>**, **q<sub>x</sub> and q<sub>y</sub>** defining points **p = (p<sub>x</sub>**, **p<sub>y</sub>)**
and (q<sub>x</sub>, q<sub>y</sub>).

## Constraints
- 1 <= n <=15
- -100 <= **p<sub>x</sub>**, **p<sub>y</sub>**, **q<sub>x</sub>**, **q<sub>y</sub>** <= 100

## Sample Input

2
0 0 1 1
1 1 2 2

## Sample Output

2 2
3 3

## Explanation

The graphs below depict points **p**, **q**, and r for the **n = 2** points given as Sample Input:

![point 1](./points1.png)

![point 2](./points2.png)