Chat common
------------------------------------

Common components used by the chat server and the client.

To build and install the dependency:
execute this in console (cd to the project root directory first) or in you favourite IDE:

`> gradle clean install`

Usage
-----
/* Map the incoming JSON message to an Object */
Message message = (Message) jsonMapper.fromJson(jsonString);

/* Route the message to a corresponding handler */
MessageHandler handler = handlerMap.get(message.getClass());
handler.onMessageReceived(message, senderAddress);

Extending the system with new message types (commands)
-----------------------------------------------------

1. Add a new class implementing the Message marker interface and fill it with the fields you deem neccessary.
    public class NewMessage implements Message {}
2. Run `> gradle clean install`.
3. To send the message: create a new instance, map it to JSON and then send it over the wire:
    String json = new JSONMapper().toJSON( new NewMessage( ... ) ) ;
    // write json string to a socket channel
3. To receive the message: add a message handler for this new type.
    HandlerMap handlerMap = new HandlerMap();
    handlerMap.put(NewMessage.class, (request, address) -> {
            // implement the message processing
    });