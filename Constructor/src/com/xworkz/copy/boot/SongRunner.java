package com.xworkz.copy.boot;

import com.xworkz.copy.object.Song;

public class SongRunner {

	public static void main(String[] args) {
		Song name1=new Song();
		Song lang1=new Song();
		Song singer1=new Song();
		Song lyricst1=new Song();
		Song type1=new Song();
		
		System.out.println(name1.name);
		System.out.println(lang1.lang);
		System.out.println(singer1.singer);
		System.out.println(lyricst1.lyricst);
		System.out.println(type1.type);
		
		name1.name="Rakkamma";
		lang1.lang="kannada";
		singer1.singer="Mangli";
		lyricst1.lyricst="Nakash Aziz";
		type1.type="josh";
		
		System.out.println(name1.name);
		System.out.println(lang1.lang);
		System.out.println(singer1.singer);
		System.out.println(lyricst1.lyricst);
		System.out.println(type1.type);
		

	}

}
