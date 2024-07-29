package br.edu.ifsp.tasksmvvm.data.repository

import br.edu.ifsp.tasksmvvm.data.dao.TaskDao
import br.edu.ifsp.tasksmvvm.data.model.Task

class TasksRepository {
    private val dao = TaskDao

    fun findAll(): List<Task>{
        return dao.getAllTasks()
    }

    fun findById(id: Long): Task{
        return dao.getTask(id)
    }

    fun insert(task: Task){
        dao.addTask(task)
    }
}