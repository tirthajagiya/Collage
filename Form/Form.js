// /models/Form.js
const mongoose = require('mongoose');

const validationSchema = new mongoose.Schema({
  isValidated: { type: Boolean, default: false },
  validationType: {
    type: String,
    enum: ['Text', 'Number', 'Length'],
    default: 'Text'
  },
  validationTypeOption: {
    type: String,
    enum: ['gt', 'lt', 'gte', 'lte', 'eq', 'neq', 'email', 'url', 'Min', 'Max']
  },
  validationError: { type: String, default: '' }
}, { _id: false });

const questionSchema = new mongoose.Schema({
  questionId: { type: String, required: true },
  label: { type: String, required: true },
  type: {
    type: String,
    enum: ['queText', 'queRadio', 'queCheckbox', 'quedropDown', 'titleAndDescription', 'file'],
    required: true
  },
  isRequired: { type: Boolean, default: false },
  options: [{ type: String }],
  validation: validationSchema
}, { _id: false });

const formSchema = new mongoose.Schema({
  userId: { type: mongoose.Schema.Types.ObjectId, ref: 'User', required: true },
  name: { type: String, required: true },
  description: { type: String },
  questions: [questionSchema],
  createdAt: { type: Date, default: Date.now }
});

module.exports = mongoose.model('Form', formSchema);
