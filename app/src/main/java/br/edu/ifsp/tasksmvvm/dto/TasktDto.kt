package br.edu.ifsp.tasksmvvm.dto

data class TaskDto(
    val id: Long,
    val description: String,
    val isCompleted: Boolean
)