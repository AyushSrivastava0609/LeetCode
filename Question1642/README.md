Intuition:-

The goal is to determine the furthest building that can be reached using the given resources (bricks and ladders).
We want to optimize the usage of ladders to skip larger jumps between buildings and use bricks to cover smaller jumps.

Approach:-

Priority Queue:
Initialize a priority queue (pq) to store the differences between consecutive building heights. This will allow us to efficiently track the jumps between buildings.
Iterate Through Heights: 
Traverse through the heights array. For each pair of consecutive buildings, calculate the difference in height.
Add Differences to Queue:
If the difference is positive (i.e., the next building is higher), add it to the priority queue.

Manage Resources:
Ladders: If the size of the priority queue exceeds the number of available ladders, we need to use a ladder to skip the current jump.
In this case, we use the smallest difference from the queue (representing the smallest jump) and decrement the available ladders.
Bricks: If there are not enough bricks to cover a jump, we return the index of the current building as the furthest reachable building.
Return: If all buildings are reachable with the given resources, return the index of the last building in the heights array.

This approach efficiently utilizes ladders to skip larger jumps and bricks to cover smaller jumps, ensuring that we can reach the furthest possible building with the provided resources.
