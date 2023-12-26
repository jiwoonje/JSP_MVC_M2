package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_Insert_Test {

	public static void main(String[] args) {
		
		// 1. DTO 객체를 생성 후 값 입력
		board.BoardDTO dto = new BoardDTO();
			//dto에 setter를 사용해서 값을 입력
			dto.setTitle("테스트 제목 1");
			dto.setWrite("users");
			dto.setContent("테스트 내용");
		
		// 2. DAO 객체에 insertBoard(dto) 호출
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(dto);
	}

}
