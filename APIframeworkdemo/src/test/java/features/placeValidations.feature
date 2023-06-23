Feature: Validating Place API's
Scenario Outline: Verify if Place is being successfully added using AddPlaceAPI
Given Add the payload with "<name>" "<language>" "<address>"
When user calls "AddPlaceAPI" with "POST" http request
Then the API call got success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"

Examples:
		|name			|language				|address		|
		|vijay 	  |telugu					|bhimavaram	|