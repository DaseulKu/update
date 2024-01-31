package com.project;

import java.util.Scanner;

public class Project1 {
	public static String registeredName = "";
    public static int registeredPassword = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
        	System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
            System.out.print("원하는 메뉴의 번호를 입력하세요> ");
            int menuNum;
            try {
                menuNum = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
                continue; 
            }
            switch (menuNum) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:if (registeredName.isEmpty() || registeredPassword == 0) {
                    System.out.println("로그인 후 이용 가능합니다.");
                    break;
                }
                bank(scanner);
                break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
                    break;
            }
        }

        System.out.println("프로그램 종료");
    }

    public static void login(Scanner scanner) {
        System.out.print("이름:");
        String name = scanner.nextLine();

        if (name.equals(registeredName)) {
            System.out.print("주민번호 앞 6자리:");
            int password = Integer.parseInt(scanner.nextLine());

            if (password == registeredPassword) {
                System.out.println("로그인 성공");
            } else {
                handleLoginFailure(scanner);
            }
        } else {
            handleLoginFailure(scanner);
        }
    }

    public static void handleLoginFailure(Scanner scanner) {
        System.out.println("로그인 실패: 아이디 또는 패스워드가 틀림");
        System.out.println("1. 다시 시도하기");
        System.out.println("2. 메뉴로 돌아가기");
        System.out.print("선택: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                login(scanner);
                break;
            case 2:
                System.out.println("메뉴로 돌아갑니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }

    public static void register(Scanner scanner) {   	
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		registeredName = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		registeredPassword = Integer.parseInt(scanner.nextLine());
		System.out.print("3. 전화번호: ");
		String num3 = scanner.nextLine();
		
        System.out.println("아이디: " + registeredName + " 비밀번호: " + registeredPassword);
    }

    public static void bank(Scanner scanner) {
    	boolean run = true;
		int balance = 0;
			while (run) {				
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");				
				System.out.print("선택> ");
				int menuNum = Integer.parseInt(scanner.nextLine());
				switch (menuNum) {
				case 1:
					System.out.print("예금액> ");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.print("출금액> ");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:
				run = false;
				break;
				}
				System.out.println();
				}
				System.out.println("프로그램 종료");
				}
			}
				