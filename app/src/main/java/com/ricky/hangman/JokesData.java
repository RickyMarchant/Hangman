package com.ricky.hangman;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;

public class JokesData
{
        public static String jokeSetup ="";
        public static String jokePunchline ="";

        static String joke_array = "{\n" +
                "  \"Joke\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the fish say when it hit the wall?\",\n" +
                "      \"punchline\": \"Dam.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you make a tissue dance?\",\n" +
                "      \"punchline\": \"You put a little boogie on it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What's Forrest Gump's password?\",\n" +
                "      \"punchline\": \"1Forrest1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a belt made out of watches?\",\n" +
                "      \"punchline\": \"A waist of time.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 5,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why can't bicycles stand on their own?\",\n" +
                "      \"punchline\": \"They are two tired\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 6,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How does a train eat?\",\n" +
                "      \"punchline\": \"It goes chew, chew\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 7,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a singing Laptop\",\n" +
                "      \"punchline\": \"A Dell\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 8,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many lips does a flower have?\",\n" +
                "      \"punchline\": \"Tulips\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 9,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you organize an outer space party?\",\n" +
                "      \"punchline\": \"You planet\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What kind of shoes does a thief wear?\",\n" +
                "      \"punchline\": \"Sneakers\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 11,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What's the best time to go to the dentist?\",\n" +
                "      \"punchline\": \"Tooth hurty.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 19,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the two silk worms in a race?\",\n" +
                "      \"punchline\": \"It ended in a tie.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 20,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a laughing motorcycle?\",\n" +
                "      \"punchline\": \"A Yamahahahaha.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 21,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"A termite walks into a bar and says...\",\n" +
                "      \"punchline\": \"'Where is the bar tended?'\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 22,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What does C.S. Lewis keep at the back of his wardrobe?\",\n" +
                "      \"punchline\": \"Narnia business!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 30,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the duck say when he bought lipstick?\",\n" +
                "      \"punchline\": \"Put it on my bill\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 31,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What happens to a frog's car when it breaks down?\",\n" +
                "      \"punchline\": \"It gets toad away\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 32,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"did you know the first French fries weren't cooked in France?\",\n" +
                "      \"punchline\": \"they were cooked in Greece\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 36,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why did the mushroom get invited to the party?\",\n" +
                "      \"punchline\": \"Because he was a fungi.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 37,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How much room is needed for a fungi to grow?\",\n" +
                "      \"punchline\": \"As mushroom as possible.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 38,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I'm reading a book about anti-gravity...\",\n" +
                "      \"punchline\": \"It's impossible to put down\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 39,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"If you're American when you go into the bathroom, and American when you come out, what are you when you're in there?\",\n" +
                "      \"punchline\": \"European\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 40,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Want to hear a joke about a piece of paper?\",\n" +
                "      \"punchline\": \"Never mind...it's tearable\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 41,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I just watched a documentary about beavers.\",\n" +
                "      \"punchline\": \"It was the best dam show I ever saw\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 42,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"If you see a robbery at an Apple Store...\",\n" +
                "      \"punchline\": \"Does that make you an iWitness?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 43,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"A ham sandwhich walks into a bar and orders a beer. The bartender says...\",\n" +
                "      \"punchline\": \"I'm sorry, we don't serve food here\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 44,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why did the Clydesdale give the pony a glass of water?\",\n" +
                "      \"punchline\": \"Because he was a little horse\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 45,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"If you boil a clown...\",\n" +
                "      \"punchline\": \"Do you get a laughing stock?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 46,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Finally realized why my plant sits around doing nothing all day...\",\n" +
                "      \"punchline\": \"He loves his pot.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 47,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Don't look at the eclipse through a colander.\",\n" +
                "      \"punchline\": \"You'll strain your eyes.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 48,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I bought some shoes from a drug dealer.\",\n" +
                "      \"punchline\": \"I don't know what he laced them with, but I was tripping all day!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 49,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why do chicken coops only have two doors?\",\n" +
                "      \"punchline\": \"Because if they had four, they would be chicken sedans\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 50,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a factory that sells passable products?\",\n" +
                "      \"punchline\": \"A satisfactory\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 51,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"When a dad drives past a graveyard: Did you know that's a popular cemetery?\",\n" +
                "      \"punchline\": \"Yep, people are just dying to get in there\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 52,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why did the invisible man turn down the job offer?\",\n" +
                "      \"punchline\": \"He couldn't see himself doing it\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 53,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you make holy water?\",\n" +
                "      \"punchline\": \"You boil the hell out of it\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 54,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I had a dream that I was a muffler last night.\",\n" +
                "      \"punchline\": \"I woke up exhausted!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 55,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why is peter pan always flying?\",\n" +
                "      \"punchline\": \"Because he neverlands\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 57,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a cow with no legs?\",\n" +
                "      \"punchline\": \"Ground beef!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 58,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I dropped a pear in my car this morning.\",\n" +
                "      \"punchline\": \"You should drop another one, then you would have a pair.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 62,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call sad coffee?\",\n" +
                "      \"punchline\": \"Despresso.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 63,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why did the butcher work extra hours at the shop?\",\n" +
                "      \"punchline\": \"To make ends meat.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 64,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the hungry clock?\",\n" +
                "      \"punchline\": \"It went back four seconds.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 65,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Well...\",\n" +
                "      \"punchline\": \"That’s a deep subject.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 66,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear the story about the cheese that saved the world?\",\n" +
                "      \"punchline\": \"It was legend dairy.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 67,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you watch the new comic book movie?\",\n" +
                "      \"punchline\": \"It was very graphic!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 68,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I started a new business making yachts in my attic this year...\",\n" +
                "      \"punchline\": \"The sails are going through the roof.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 69,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I got hit in the head by a soda can, but it didn't hurt that much...\",\n" +
                "      \"punchline\": \"It was a soft drink.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 70,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I can't tell if i like this blender...\",\n" +
                "      \"punchline\": \"It keeps giving me mixed results.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 71,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"I couldn't get a reservation at the library...\",\n" +
                "      \"punchline\": \"They were fully booked.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 75,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you give to a lemon in need?\",\n" +
                "      \"punchline\": \"Lemonaid.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 76,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Never take advice from electrons.\",\n" +
                "      \"punchline\": \"They are always negative.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 78,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Hey, dad, did you get a haircut?\",\n" +
                "      \"punchline\": \"No, I got them all cut.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 79,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What time is it?\",\n" +
                "      \"punchline\": \"I don't know... it keeps changing.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 80,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"A weasel walks into a bar. The bartender says, \\\"Wow, I've never served a weasel before. What can I get for you?\\\"\",\n" +
                "      \"punchline\": \"Pop,goes the weasel.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 81,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Bad at golf?\",\n" +
                "      \"punchline\": \"Join the club.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 82,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Can a kangaroo jump higher than the Empire State Building?\",\n" +
                "      \"punchline\": \"Of course. The Empire State Building can't jump.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 83,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Can February march?\",\n" +
                "      \"punchline\": \"No, but April may.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 84,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Can I watch the TV?\",\n" +
                "      \"punchline\": \"Yes, but don’t turn it on.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 85,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Dad, can you put my shoes on?\",\n" +
                "      \"punchline\": \"I don't think they'll fit me.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 86,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the bread factory burning down?\",\n" +
                "      \"punchline\": \"They say the business is toast.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 88,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the cheese factory that exploded in France?\",\n" +
                "      \"punchline\": \"There was nothing left but de Brie.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 89,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the cow who jumped over the barbed wire fence?\",\n" +
                "      \"punchline\": \"It was udder destruction.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 90,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the guy who invented Lifesavers?\",\n" +
                "      \"punchline\": \"They say he made a mint.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 91,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the guy whose whole left side was cut off?\",\n" +
                "      \"punchline\": \"He's all right now.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 92,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the kidnapping at school?\",\n" +
                "      \"punchline\": \"It's ok, he woke up.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 93,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the Mexican train killer?\",\n" +
                "      \"punchline\": \"He had loco motives\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 94,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the new restaurant on the moon?\",\n" +
                "      \"punchline\": \"The food is great, but there’s just no atmosphere.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 95,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the runner who was criticized?\",\n" +
                "      \"punchline\": \"He just took it in stride\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 96,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the scientist who was lab partners with a pot of boiling water?\",\n" +
                "      \"punchline\": \"He had a very esteemed colleague.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 97,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear about the submarine industry?\",\n" +
                "      \"punchline\": \"It really took a dive...\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 98,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear that David lost his ID in prague?\",\n" +
                "      \"punchline\": \"Now we just have to call him Dav.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 99,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear that the police have a warrant out on a midget psychic ripping people off?\",\n" +
                "      \"punchline\": \"It reads \\\"Small medium at large.\\\"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 100,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear the joke about the wandering nun?\",\n" +
                "      \"punchline\": \"She was a roman catholic.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 101,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear the news?\",\n" +
                "      \"punchline\": \"FedEx and UPS are merging. They’re going to go by the name Fed-Up from now on.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 102,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you hear the one about the guy with the broken hearing aid?\",\n" +
                "      \"punchline\": \"Neither did he.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 103,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you know crocodiles could grow up to 15 feet?\",\n" +
                "      \"punchline\": \"But most just have 4.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 104,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do ghosts call their true love?\",\n" +
                "      \"punchline\": \"Their ghoul-friend\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 105,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you know that protons have mass?\",\n" +
                "      \"punchline\": \"I didn't even know they were catholic.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 106,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Did you know you should always take an extra pair of pants golfing?\",\n" +
                "      \"punchline\": \"Just in case you get a hole in one.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 107,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Do I enjoy making courthouse puns?\",\n" +
                "      \"punchline\": \"Guilty\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 108,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Do you know where you can get chicken broth in bulk?\",\n" +
                "      \"punchline\": \"The stock market.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 109,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Do you want a brief explanation of what an acorn is?\",\n" +
                "      \"punchline\": \"In a nutshell, it's an oak tree.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 110,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Ever wondered why bees hum?\",\n" +
                "      \"punchline\": \"It's because they don't know the words.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 111,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Have you ever heard of a music group called Cellophane?\",\n" +
                "      \"punchline\": \"They mostly wrap.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 112,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Have you heard of the band 1023MB?\",\n" +
                "      \"punchline\": \"They haven't got a gig yet.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 113,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Have you heard the rumor going around about butter?\",\n" +
                "      \"punchline\": \"Never mind, I shouldn't spread it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 114,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How are false teeth like stars?\",\n" +
                "      \"punchline\": \"They come out at night!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 115,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How can you tell a vampire has a cold?\",\n" +
                "      \"punchline\": \"They start coffin.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 116,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How come a man driving a train got struck by lightning?\",\n" +
                "      \"punchline\": \"He was a good conductor.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 117,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How come the stadium got hot after the game?\",\n" +
                "      \"punchline\": \"Because all of the fans left.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 118,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How did Darth Vader know what Luke was getting for Christmas?\",\n" +
                "      \"punchline\": \"He felt his presents.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 119,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How did the hipster burn the roof of his mouth?\",\n" +
                "      \"punchline\": \"He ate the pizza before it was cool.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 120,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do hens stay fit?\",\n" +
                "      \"punchline\": \"They always egg-cercise!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 121,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do locomotives know where they're going?\",\n" +
                "      \"punchline\": \"Lots of training\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 122,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do the trees get on the internet?\",\n" +
                "      \"punchline\": \"They log on.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 123,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you find Will Smith in the snow?\",\n" +
                "      \"punchline\": \" Look for fresh prints.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 124,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you fix a broken pizza?\",\n" +
                "      \"punchline\": \"With tomato paste.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 125,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you fix a damaged jack-o-lantern?\",\n" +
                "      \"punchline\": \"You use a pumpkin patch.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 126,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you get a baby alien to sleep?\",\n" +
                "      \"punchline\": \" You rocket.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 127,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you get two whales in a car?\",\n" +
                "      \"punchline\": \"Start in England and drive West.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 128,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you know if there’s an elephant under your bed?\",\n" +
                "      \"punchline\": \"Your head hits the ceiling!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 129,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you make a hankie dance?\",\n" +
                "      \"punchline\": \"Put a little boogie in it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 130,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you make holy water?\",\n" +
                "      \"punchline\": \"You boil the hell out of it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 131,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you organize a space party?\",\n" +
                "      \"punchline\": \"You planet.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 132,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you steal a coat?\",\n" +
                "      \"punchline\": \"You jacket.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 133,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How do you tell the difference between a crocodile and an alligator?\",\n" +
                "      \"punchline\": \"You will see one later and one in a while.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 134,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How does a dyslexic poet write?\",\n" +
                "      \"punchline\": \"Inverse.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 135,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How does a French skeleton say hello?\",\n" +
                "      \"punchline\": \"Bone-jour.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 136,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How does a penguin build it’s house?\",\n" +
                "      \"punchline\": \"Igloos it together.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 137,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How does a scientist freshen their breath?\",\n" +
                "      \"punchline\": \"With experi-mints!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 138,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How does the moon cut his hair?\",\n" +
                "      \"punchline\": \"Eclipse it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 139,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many apples grow on a tree?\",\n" +
                "      \"punchline\": \"All of them!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 140,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many bones are in the human hand?\",\n" +
                "      \"punchline\": \"A handful of them.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 141,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many hipsters does it take to change a lightbulb?\",\n" +
                "      \"punchline\": \"Oh, it's a really obscure number. You've probably never heard of it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 142,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many kids with ADD does it take to change a lightbulb?\",\n" +
                "      \"punchline\": \"Let's go ride bikes!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 143,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many optometrists does it take to change a light bulb?\",\n" +
                "      \"punchline\": \"1 or 2? 1... or 2?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 144,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many seconds are in a year?\",\n" +
                "      \"punchline\": \"12. January 2nd, February 2nd, March 2nd, April 2nd.... etc\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 145,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many South Americans does it take to change a lightbulb?\",\n" +
                "      \"punchline\": \"A Brazilian\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 146,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How many tickles does it take to tickle an octopus?\",\n" +
                "      \"punchline\": \"Ten-tickles!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 147,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How much does a hipster weigh?\",\n" +
                "      \"punchline\": \"An instagram.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 148,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"How was the snow globe feeling after the storm?\",\n" +
                "      \"punchline\": \"A little shaken.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 149,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Is the pool safe for diving?\",\n" +
                "      \"punchline\": \"It deep ends.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 150,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Is there a hole in your shoe?\",\n" +
                "      \"punchline\": \"No… Then how’d you get your foot in it?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 151,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the spaghetti say to the other spaghetti?\",\n" +
                "      \"punchline\": \"Pasta la vista, baby!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 152,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What’s 50 Cent’s name in Zimbabwe?\",\n" +
                "      \"punchline\": \"200 Dollars.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 153,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Want to hear a chimney joke?\",\n" +
                "      \"punchline\": \"Got stacks of em! First one's on the house\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 154,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Want to hear a joke about construction?\",\n" +
                "      \"punchline\": \"Nah, I'm still working on it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 155,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Want to hear my pizza joke?\",\n" +
                "      \"punchline\": \"Never mind, it's too cheesy.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 156,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What animal is always at a game of cricket?\",\n" +
                "      \"punchline\": \"A bat.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 157,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What are the strongest days of the week?\",\n" +
                "      \"punchline\": \"Saturday and Sunday...the rest are weekdays.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 158,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What biscuit does a short person like?\",\n" +
                "      \"punchline\": \"Shortbread. \"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 159,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What cheese can never be yours?\",\n" +
                "      \"punchline\": \"Nacho cheese.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 160,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What creature is smarter than a talking parrot?\",\n" +
                "      \"punchline\": \"A spelling bee.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 161,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did celery say when he broke up with his girlfriend?\",\n" +
                "      \"punchline\": \"She wasn't right for me, so I really don't carrot all.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 162,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did Michael Jackson name his denim store?\",\n" +
                "      \"punchline\": \"   Billy Jeans!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 163,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did one nut say as he chased another nut?\",\n" +
                "      \"punchline\": \" I'm a cashew!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 164,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did one plate say to the other plate?\",\n" +
                "      \"punchline\": \"Dinner is on me!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 165,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did one snowman say to the other snow man?\",\n" +
                "      \"punchline\": \"Do you smell carrot?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 166,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did one wall say to the other wall?\",\n" +
                "      \"punchline\": \"I'll meet you at the corner!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 167,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did Romans use to cut pizza before the rolling cutter was invented?\",\n" +
                "      \"punchline\": \"Lil Caesars\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 168,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the 0 say to the 8?\",\n" +
                "      \"punchline\": \"Nice belt.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 169,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the beaver say to the tree?\",\n" +
                "      \"punchline\": \"It's been nice gnawing you.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 170,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the big flower say to the littler flower?\",\n" +
                "      \"punchline\": \"Hi, bud!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 180,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the Buffalo say to his little boy when he dropped him off at school?\",\n" +
                "      \"punchline\": \"Bison.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 181,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the digital clock say to the grandfather clock?\",\n" +
                "      \"punchline\": \"Look, no hands!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 182,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the dog say to the two trees?\",\n" +
                "      \"punchline\": \"Bark bark.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 183,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the Dorito farmer say to the other Dorito farmer?\",\n" +
                "      \"punchline\": \"Cool Ranch!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 184,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the fish say when it swam into a wall?\",\n" +
                "      \"punchline\": \"Damn!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 185,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the grape do when he got stepped on?\",\n" +
                "      \"punchline\": \"He let out a little wine.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 186,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the judge say to the dentist?\",\n" +
                "      \"punchline\": \"Do you swear to pull the tooth, the whole tooth and nothing but the tooth?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 187,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the late tomato say to the early tomato?\",\n" +
                "      \"punchline\": \"I’ll ketch up\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 188,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the left eye say to the right eye?\",\n" +
                "      \"punchline\": \"Between us, something smells!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 189,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the mountain climber name his son?\",\n" +
                "      \"punchline\": \"Cliff.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 189,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the ocean say to the beach?\",\n" +
                "      \"punchline\": \"Thanks for all the sediment.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 190,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the ocean say to the shore?\",\n" +
                "      \"punchline\": \"Nothing, it just waved.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 191,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"Why don't you find hippopotamuses hiding in trees?\",\n" +
                "      \"punchline\": \"They're really good at it.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 192,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the pirate say on his 80th birthday?\",\n" +
                "      \"punchline\": \"Aye Matey!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 193,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the Red light say to the Green light?\",\n" +
                "      \"punchline\": \"Don't look at me I'm changing!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 194,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the scarf say to the hat?\",\n" +
                "      \"punchline\": \"You go on ahead, I am going to hang around a bit longer.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 195,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the shy pebble wish for?\",\n" +
                "      \"punchline\": \"That she was a little boulder.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 196,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the traffic light say to the car as it passed?\",\n" +
                "      \"punchline\": \"Don't look I'm changing!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 197,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What did the Zen Buddist say to the hotdog vendor?\",\n" +
                "      \"punchline\": \"Make me one with everything.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 198,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do birds give out on Halloween?\",\n" +
                "      \"punchline\": \"Tweets.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 199,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do I look like?\",\n" +
                "      \"punchline\": \"A JOKE MACHINE!?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 200,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do prisoners use to call each other?\",\n" +
                "      \"punchline\": \"Cell phones.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 201,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do vegetarian zombies eat?\",\n" +
                "      \"punchline\": \"Grrrrrainnnnnssss.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 202,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a bear with no teeth?\",\n" +
                "      \"punchline\": \"A gummy bear!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 203,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a bee that lives in America?\",\n" +
                "      \"punchline\": \"A USB.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 204,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a boomerang that won't come back?\",\n" +
                "      \"punchline\": \"A stick.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 205,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a careful wolf?\",\n" +
                "      \"punchline\": \"Aware wolf.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 206,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a cow on a trampoline?\",\n" +
                "      \"punchline\": \"A milk shake!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 207,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a cow with no legs?\",\n" +
                "      \"punchline\": \"Ground beef.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 208,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a cow with two legs?\",\n" +
                "      \"punchline\": \"Lean beef.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 210,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a dad that has fallen through the ice?\",\n" +
                "      \"punchline\": \"A Popsicle.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 211,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a dictionary on drugs?\",\n" +
                "      \"punchline\": \"High definition.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 212,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"what do you call a dog that can do magic tricks?\",\n" +
                "      \"punchline\": \"a labracadabrador\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 213,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a droid that takes the long way around?\",\n" +
                "      \"punchline\": \"R2 detour.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 214,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a duck that gets all A's?\",\n" +
                "      \"punchline\": \"A wise quacker.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 215,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a fake noodle?\",\n" +
                "      \"punchline\": \"An impasta.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 216,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a fashionable lawn statue with an excellent sense of rhythmn?\",\n" +
                "      \"punchline\": \"A metro-gnome\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 217,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a fat psychic?\",\n" +
                "      \"punchline\": \"A four-chin teller.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 218,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a fly without wings?\",\n" +
                "      \"punchline\": \"A walk.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 219,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a girl between two posts?\",\n" +
                "      \"punchline\": \"Annette.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 220,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a group of disorganized cats?\",\n" +
                "      \"punchline\": \"A cat-tastrophe.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 221,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a group of killer whales playing instruments?\",\n" +
                "      \"punchline\": \"An Orca-stra.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 222,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a monkey in a mine field?\",\n" +
                "      \"punchline\": \"A babooooom!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 223,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a nervous javelin thrower?\",\n" +
                "      \"punchline\": \"Shakespeare.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 224,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a pig that knows karate?\",\n" +
                "      \"punchline\": \"A pork chop!\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 225,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a pig with three eyes?\",\n" +
                "      \"punchline\": \"Piiig\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 226,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a pile of cats?\",\n" +
                "      \"punchline\": \" A Meowtain.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 227,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a sheep with no legs?\",\n" +
                "      \"punchline\": \"A cloud.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 228,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call a troublesome Canadian high schooler?\",\n" +
                "      \"punchline\": \"A poutine.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 229,\n" +
                "      \"type\": \"general\",\n" +
                "      \"setup\": \"What do you call an alligator in a vest?\",\n" +
                "      \"punchline\": \"An in-vest-igator!\"\n" +
                "    }]\n" +
                "}";


    static String programming_joke = "{\n" +
            "  \"Programming Joke\": [\n" +
            "    {\n" +
            "      \"id\": 15,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"What's the best thing about a Boolean?\",\n" +
            "      \"punchline\": \"Even if you're wrong, you're only off by a bit.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 16,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"What's the object-oriented way to become wealthy?\",\n" +
            "      \"punchline\": \"Inheritance\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 17,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"Where do programmers like to hangout?\",\n" +
            "      \"punchline\": \"The Foo Bar.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 18,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"Why did the programmer quit his job?\",\n" +
            "      \"punchline\": \"Because he didn't get arrays.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 33,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"Which song would an exception sing?\",\n" +
            "      \"punchline\": \"Can't catch me - Avicii\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 72,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"How many software engineers does it take to change a light bulb?\",\n" +
            "      \"punchline\": \"Not our problem; it's a hardware issue.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 73,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"How do you know if your code is delicious?\",\n" +
            "      \"punchline\": \"Try a byte.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 74,\n" +
            "      \"type\": \"programming\",\n" +
            "      \"setup\": \"Why do C# and Java developers keep breaking their keyboards?\",\n" +
            "      \"punchline\": \"Because they use a strongly typed language.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"setup\": \"Why do all Pascal programmers ask to live in Atlantis?\",\n" +
            "      \"punchline\": \"Because it is below C level\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"setup\": \"What do computers and air conditioners have in common?\",\n" +
            "      \"punchline\": \"They both become useless when you open windows\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"setup\": \"Why do Java programmers have to wear glasses?\",\n" +
            "      \"punchline\": \"Because they can't C#\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"setup\": \"A SQL query goes into a bar,walks up to two tables and asks...\",\n" +
            "      \"punchline\": \"Can I join you?\"\n" +
            "    }]\n" +
            "  }";


static String animal_fact = "{\n" +
        "  \"Animal Fact\": [\n" +
        "    {\n" +
        "      \"setup\": \"Trained pigeons...\",\n" +
        "      \"punchline\": \"can tell the difference between the paintings of Pablo Picasso and Claude Monet.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Capuchin monkeys...\",\n" +
        "      \"punchline\": \"pee on their hands to wash their feet.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"The heart of a shrimp is...\",\n" +
        "      \"punchline\": \"located in its head.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Only males...\",\n" +
        "      \"punchline\": \"are called peacocks. Females are called peahens.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Flamingos are....\",\n" +
        "      \"punchline\": \"naturally white. Their diet of brine and shrimp turns them pink.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"A snail can...\",\n" +
        "      \"punchline\": \"sleep for three years.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Elephants are...\",\n" +
        "      \"punchline\": \"the only animal that can't jump.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"A rhinoceros' horn ...\",\n" +
        "      \"punchline\": \"is made of hair.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"It takes a sloth two weeks...\",\n" +
        "      \"punchline\": \"to digest its food.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Nearly three percent of the ice in Antartic glaciers\",\n" +
        "      \"punchline\": \"is penguin urine.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"The closest living relatives to the Tyrannosaurus Rex...\",\n" +
        "      \"punchline\": \"are chickens.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Hippos kill more humans...\",\n" +
        "      \"punchline\": \"than any other mammal per year.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Turkeys can reproduce...\",\n" +
        "      \"punchline\": \"without having sex.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Emus cannot...\",\n" +
        "      \"punchline\": \"walk backwards.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Elephants have a specific alarm call that means...\",\n" +
        "      \"punchline\": \"human.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Warmer weather causes...\",\n" +
        "      \"punchline\": \"more turtles to be born female than male.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Honeybees can flap their wings...\",\n" +
        "      \"punchline\": \"200 times every second.\"\n" +
        "    }]\n" +
        "  }";

static String bear_fact = "{\n" +
        "  \"Dwight's Bear Fact\": [\n" +
        "    {\n" +
        "      \"setup\": \"A grizzly bears bite is...\",\n" +
        "      \"punchline\": \"strong enough to crush a bowling ball.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Polar bears...\",\n" +
        "      \"punchline\": \"have black skin.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Bears can run up to 40 miles per hour, fast enough to catch a running horse...\",\n" +
        "      \"punchline\": \"The fastest known human can run 27 mph.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"A swimming polar bear can jump...\",\n" +
        "      \"punchline\": \"8 ft. (2.4 m) out of the water to surprise a seal.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"A polar bear’s stomach can hold...\",\n" +
        "      \"punchline\": \"150 lbs. (68 kg) of meat.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Koala bears are not bears at all and are not related to the bear family...\",\n" +
        "      \"punchline\": \"They are marsupials.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"The polar bear is the largest bear species...\",\n" +
        "      \"punchline\": \"A male polar bear can measure up to 10 feet long and weigh 1,500 lbs.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Polar bears and brown bears shared a comman ancestor...\",\n" +
        "      \"punchline\": \"as many as six million years ago before polar bears became a distinct species.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"The giant panda...\",\n" +
        "      \"punchline\": \"is actually a bear.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Bears have an excellent sense of smell,...\",\n" +
        "      \"punchline\": \"better than dogs or possibly any other mammal.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"All polar bears alive today can trace their ancestry...\",\n" +
        "      \"punchline\": \"back to one female brown bear who lived in Ireland 50,000 years ago.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"A group of bears is...\",\n" +
        "      \"punchline\": \"called a sloth.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Polar bears can smell its prey on the ice..\",\n" +
        "      \"punchline\": \"20 miles away.\"\n" +
        "    },\n" +
        "    {\n" +
        "      \"setup\": \"Male bears are called boars and...\",\n" +
        "      \"punchline\": \"female bears are called sows.\"\n" +
        "    }]"+
        "  }";






        public static void retrieveGeneralJoke()
        {
        try {
            JSONObject jsonObject = new JSONObject(joke_array);
            JSONArray jsonArray = jsonObject.getJSONArray("Joke");
            Random rand = new Random();
            JSONObject joke = jsonArray.getJSONObject(rand.nextInt(jsonArray.length()));

            jokeSetup = joke.getString("setup");
            jokePunchline = joke.getString("punchline");

            } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public static void retrieveProgrammingJoke()
    {
        try {
            JSONObject jsonObject = new JSONObject(programming_joke);
            JSONArray jsonArray = jsonObject.getJSONArray("Programming Joke");
            Random rand = new Random();
            JSONObject joke = jsonArray.getJSONObject(rand.nextInt(jsonArray.length()));

            jokeSetup = joke.getString("setup");
            jokePunchline = joke.getString("punchline");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public static void retrieveAnimalFact()
    {
        try {
            JSONObject jsonObject = new JSONObject(animal_fact);
            JSONArray jsonArray = jsonObject.getJSONArray("Animal Fact");
            Random rand = new Random();
            JSONObject joke = jsonArray.getJSONObject(rand.nextInt(jsonArray.length()));

            jokeSetup = joke.getString("setup");
            jokePunchline = joke.getString("punchline");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public static void retrieveBearFact()
    {
        try {
            JSONObject jsonObject = new JSONObject(bear_fact);
            JSONArray jsonArray = jsonObject.getJSONArray("Dwight's Bear Fact");
            Random rand = new Random();
            JSONObject joke = jsonArray.getJSONObject(rand.nextInt(jsonArray.length()));

            jokeSetup = joke.getString("setup");
            jokePunchline = joke.getString("punchline");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}


