package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int amount = 0;
		int price = 100;
		System.out.println("鉛筆を購入しますか？");
		System.out.println("はい：０、いいえ：１>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int buyFlag = Integer.parseInt(str);

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の個数を１つ増やしますか?");
			System.out.println("はい：０、いいえ：１>");
			str = reader.readLine();
			buyFlag = Integer.parseInt(str);
		}
		System.out.println("購入したおにぎりの数は" + amount + "個です。");
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");
	}

}
