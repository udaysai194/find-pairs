### Find Pairs API
1. Start the Spring boot Application
2. Hit the following curl command to find the pair of indices where the sum of the elements at those indices equals the target value.
```commandline
curl --location 'http://localhost:8080/api/find-pairs' \
--header 'Content-Type: application/json' \
--data '{
    "numbers": [11, 11],
    "target": 6
}'
```
3. Replace numbers and target required

Sample request:
```commandline
{
    "numbers": [1, 2, 3, 4, 5],
    "target": 6
}
```
Sample response:
```commandline
{
    "pairs": [
        [
            1,
            3
        ],
        [
            0,
            4
        ]
    ]
}
```