import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ユーザーインプットをインスタンス化
		Scanner scan = new Scanner(System.in);

		//配列作成
		ArrayList<Integer> num = new ArrayList();

		//ユーザがいれたデータ型が違う場合に使用
		boolean wrongDatatype;
		//ループを何回するかここの変数に入れる
		int size;
		//ユーザがいれた型の変換用
		String notConverted;

		//数字以外を入れられた場合の例外処理です
		while (true) {
			try {
				System.out.println("何回ループしますか。回数を数字で入力してください");
				notConverted = scan.next();
				size = Integer.parseInt(notConverted);
				wrongDatatype = false;
				break;
			} catch (Exception e) {
				System.out.println("文字ではなく半角数字を入力してください");
				wrongDatatype = true;
			}
		}

		//ループする回数分、ユーザー任意の数字を配列にいれる
		System.out.println("好きな数字をいれてください。ループの回数分表示します");
		for (int i = 0; i < size; i++) {
			num.add(scan.nextInt());
		}

		//拡張for分で配列に入れた数字を繰り返し表示する。
		for (int value : num) {
			System.out.println(value);
		}

	}

}
