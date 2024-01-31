package chap09.sec01.verify;

public class Chatting { // 04번
	public static void main(String[] args) {
		Chatting chatting = new Chatting();
		chatting.startChatting("ChatId");
	}
	void startChatting(String chatId) {
		String nickName = chatId;
		class Chat {
			void start() {
				while (true) {
					String inputData = "Hello";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
					break;
				}
			}
			void sendMessage(String message) {
				System.out.println(message);
			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}