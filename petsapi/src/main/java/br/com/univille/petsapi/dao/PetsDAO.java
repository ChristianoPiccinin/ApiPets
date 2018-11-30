package br.com.univille.petsapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.univille.petsapi.connectionfactory.ConnectionFactory;
import br.com.univille.petsapi.model.Pets;

public class PetsDAO extends ConnectionFactory{
	
	public List<Pets> getAll(){
		
		ArrayList<Pets> pets = new ArrayList<Pets>();
		try{
			Connection connection = getConnection();
			PreparedStatement stmt = connection.prepareStatement("select id, nome, especie, sexo from pet");
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				Pets pet = new Pets();
				pet.setId(resultSet.getInt(1));
				pet.setNome(resultSet.getString(2));
				pet.setEspecie(resultSet.getString(3));
				pet.setSexo(resultSet.getString(4));
				pets.add(pet);
			}
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }
		return pets;
	}
		
	public Pets get(int id){
		
		Pets pet = new Pets();
		try{
			Connection connection = getConnection();
			PreparedStatement stmt = connection.prepareStatement("select id, nome, especie, sexo from pet where id = ?");
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				pet.setId(resultSet.getInt(1));
				pet.setNome(resultSet.getString(2));
				pet.setEspecie(resultSet.getString(3));
				pet.setSexo(resultSet.getString(4));
			}
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }
		return pet;
	}

	public void insert(Pets Pet) {
		try{

			Connection connection = getConnection();

			PreparedStatement stmt = connection.prepareStatement("insert pet(nome, especie, sexo) values(?, ?, ?)");
			stmt.setString(1, Pet.getNome());
			stmt.setString(2, Pet.getEspecie());
			stmt.setString(3, Pet.getSexo());

			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }
		
	}

	public void deleteById(int id) throws Exception {
		try{

			Connection connection = getConnection();

			PreparedStatement stmt = connection.prepareStatement("delete from pet where id = ?");
			stmt.setInt(1, id);

			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }
	}
	
	public void putByPet(Pets pet) throws Exception {
		try{

			Connection connection = getConnection();

			PreparedStatement stmt = connection.prepareStatement("update pet set nome = ?, especie = ?, sexo = ? where id = ?");
			
			stmt.setString(1, pet.getNome());
			stmt.setString(2, pet.getEspecie());
			stmt.setString(3, pet.getSexo());
			stmt.setInt(4, pet.getId());

			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }
	}

}
