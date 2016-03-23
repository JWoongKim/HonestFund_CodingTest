package main;

import java.util.Random;

public class AnimalMain {
	public static void main(String[] args) {

		int[] numbers = new int[6];

		String[] animalsName = new String[6];
		String[] animalsCry = new String[6];

		animalsName[0] = "강아지";
		animalsName[1] = "고양이";
		animalsName[2] = "금붕어";
		animalsName[3] = "돌고래";
		animalsName[4] = "호랑이";
		animalsName[5] = "앵무새";

		animalsCry[0] = "멍멍";
		animalsCry[1] = "야옹";
		animalsCry[2] = "울지 못한다.";
		animalsCry[3] = "초음파";
		animalsCry[4] = "어흥";
		animalsCry[5] = "삐릿";

		Random r = new Random();

		for(int i = 0; i <= 5; i++){

			if(i == 2){
				System.out.println(animalsName[2] + "는 " + animalsCry[2]);
			}else if(i == 3){
				System.out.println(animalsName[3] + "는 인간이 들을 수 없는 소리로 운다. - " + animalsCry[3]);
			}else if(i == 5){
				System.out.println(animalsName[i] + "는 인간이 들을 수 있는 소리로 운다. - " + animalsName[i-1] + "의 소리를 따라한다. - " + animalsCry[i-1]);
			}else{
				System.out.println(animalsName[i] + "는 인간이 들을 수 있는 소리로 운다. - " + animalsCry[i]);
			}
		}
	}
}
