Intuition:-

The problem statement is to find the "judge" in a town where there is a group of people and trust relationships among them.
The judge is someone who is trusted by everyone else in the town but does not trust anyone themselves.

Approach:-

Initializing trustCounts array:
First, an array trustCounts is initialized to keep track of the count of trusts for each person in the town.
The size of this array is n + 1, where n is the number of people in the town.

Iterating through trust array:
Next, the code iterates through the trust array, which represents the trust relationships between pairs of people.
For each pair (personA, personB) in the trust array, it decreases the trust count for personA (the one who trusts) and increases the trust count for personB (the one being trusted).

Finding the judge:
After updating the trust counts, the code checks each person in the town to find the one who is trusted by everyone else. 
It does this by iterating through the trustCounts array. If the trust count for a person i is equal to n - 1 (where n is the total number of people),
it means that this person is trusted by everyone else in the town. In this case, it returns i as the judge.

Returning -1 if no judge found:
If no judge is found after checking all the people, the code returns -1, indicating that there is no judge in the town.

Overall, the approach is to keep track of the trust counts for each person and then find the person who is trusted by everyone else, which is the judge.
If such a person exists, their index is returned; otherwise, -1 is returned.
