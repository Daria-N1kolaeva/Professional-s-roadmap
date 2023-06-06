package com.example.kurs;

import java.util.List;

/**
 * Обявлем интерфейс доступа данным.
 * <p>
 * InterfaceDB должен поддерживать четыре метода
 */
public interface InterfaceDB
{
    /**
     * Возвращает список всех баз данных.
     *
     * @return список баз данных.
     */
    List<DB> getAllDB();
    /**
     * Возвращает объект базы данных по данному идентификатору.
     *
     * @param id идентификатор базы данных.
     * @return объект базы данных.
     */
    DB getDBById(int id);
    /**
     * Добавляет базу данных.
     *
     * @param DB база данных, которую нужно добавить.
     */
    void addDB(DB DB);
    /**
     * Обновляет данные в базе данных.
     *
     * @param DB база данных, которую нужно обновить.
     */
    void updateDB(DB DB);
    /**
     * Удаляет базу данных по указанному идентификатору.
     *
     * @param id идентификатор базы данных.
     */
    void deleteDB(int id);
}