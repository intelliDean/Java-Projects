package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneDriver.enter;

public class Menu {
    public static void menu() {
        System.out.println("""       
                            
                    ☆꧁ 𝓟𝓗𝓞𝓝𝓔 𝓜𝓔𝓝𝓤 ꧂☆
                    1:  📗 𝓟𝓱𝓸𝓷𝓮𝓫𝓸𝓸𝓴 🔂
                    2:  💌 𝓜𝓮𝓼𝓼𝓪𝓰𝓮 🔂
                    3:  💬 𝓒𝓱𝓪𝓽
                    4:  ☎️𝓒𝓪𝓵𝓵 𝓡𝓮𝓰𝓲𝓼𝓽𝓮𝓻 🔂
                    5:  🎵 𝓣𝓸𝓷𝓮𝓼 🔂
                    6:  ⚙️𝓢𝓮𝓽𝓽𝓲𝓷𝓰𝓼 🔂
                    7:  ↪️𝓒𝓪𝓵𝓵 𝓓𝓲𝓿𝓮𝓻𝓽𝓼
                    8:  🎮 𝓖𝓪𝓶𝓮𝓼
                    9:  🧮 𝓒𝓪𝓵𝓬𝓾𝓵𝓪𝓽𝓸𝓻
                    10: 🎗️ 𝓡𝓮𝓶𝓲𝓷𝓭𝓮𝓻𝓼
                    11: 🕐 𝓒𝓵𝓸𝓬𝓴 🔂
                    12: 🌈 𝓟𝓻𝓸𝓯𝓲𝓵𝓮
                    13: 🈂️ 𝓢𝓘𝓜 𝓢𝓮𝓻𝓿𝓲𝓬𝓮
                    
                    99: Exit""");
        switch (enter()) {
            case 1 -> Phonebook.phone();
            case 2 -> Message.message();
            case 3 -> Chat.chat();
            case 4 -> CallRegister.callRegister();
            case 5 -> Tone.tone();
            case 6 -> Settings.settings();
            case 7 -> CallDivert.callDivert();
            case 8 -> Games.games();
            case 9 -> Calculator.calculator();
            case 10 -> Reminders.reminders();
            case 11 -> Clock.clock();
            case 12 -> Profile.profile();
            case 13 -> SimService.simService();
            default -> System.out.println("Goodbye!");
        }
    }
}
