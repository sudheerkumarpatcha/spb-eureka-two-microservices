# spb-eureka-two-microservices

Rest request flow:

service-one --> eureka-server-registry --> post-service
Rest calls:

Get Reqest to fetch all the post available in post service:
http://localhost:9002/serviceone/posts

output:
{
    "posts": [
        {
            "message": "test message 1",
            "messageId": 1
        },
        {
            "message": "test message 2",
            "messageId": 2
        }
    ]
}

Get Request to fetch post base on the message ID:

http://localhost:9002/serviceone/post/1

output:
{
    "message": "test message 1",
    "messageId": 1
}

Post request to create post in post service :

http://localhost:9002/serviceone/post

input:
{
    "message": "test message 1",
    "messageId": 1
}

output:
{
    "message": "test message 1",
    "messageId": 1
}
